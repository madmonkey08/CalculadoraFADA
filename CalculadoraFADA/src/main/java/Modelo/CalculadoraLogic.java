package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BrawlCodak
 */
public class CalculadoraLogic {

    private enum Operacion {
        SUMA, RESTA, PRODUCTO, DIVISION, POTENCIA;
    };

    private final List<String> operacionesposibles;
    private final List<String> digitos;
    private final List<Operacion> operacionespendientes;
    private final List<Operacion> prioridades;
    private String digito;

    public CalculadoraLogic() {
        operacionesposibles = new ArrayList<>();
        digitos = new ArrayList<>();
        operacionespendientes = new ArrayList<>();
        prioridades = new ArrayList<>();
        digito = "";
        introducirOperaciones();
        definirPrioridadOperaciones();
    }

    private double evaluarOperacion(String digito1, String digito2, Operacion operacion) {
        System.out.println(" metodo - > evaluarOperacion");
        double valor = 0;

        switch (operacion) {
            case SUMA:
                valor = Double.parseDouble(digito1) + Double.parseDouble(digito2);
                break;
            case RESTA:
                valor = Double.parseDouble(digito1) - Double.parseDouble(digito2);
                break;
            case PRODUCTO:
                valor = Double.parseDouble(digito1) * Double.parseDouble(digito2);
                break;
            case DIVISION:
                valor = Double.parseDouble(digito1) / Double.parseDouble(digito2);
                break;
            case POTENCIA:
                valor = Math.pow(Double.parseDouble(digito1), Double.parseDouble(digito2));
                break;
        }

        return valor;
    }

    private void extraerDigitosOperaciones(String expresion) {
        for (int i = 0; i < expresion.length();) {

            while ((i < expresion.length()) && (!operacionesposibles.contains(new String() + expresion.charAt(i)))) {

                digito += expresion.charAt(i++);
            }
            if (i < expresion.length()) {
                switch (expresion.charAt(i++)) {
                    case '+':
                        operacionespendientes.add(Operacion.SUMA);
                        break;
                    case '-':
                        if ((i - 2) >= 0
                                && expresion.charAt(i - 2) != '+'
                                && expresion.charAt(i - 2) != '-'
                                && expresion.charAt(i - 2) != '*'
                                && expresion.charAt(i - 2) != '/'
                                && expresion.charAt(i - 2) != '^') {
                            operacionespendientes.add(Operacion.RESTA);
                        } else {
                            while (i < expresion.length()
                                    && expresion.charAt(i) != '+'
                                    && expresion.charAt(i) != '-'
                                    && expresion.charAt(i) != '*'
                                    && expresion.charAt(i) != '/'
                                    && expresion.charAt(i) != '^') {
                                digito += expresion.charAt(i++);
                            }
                            double digitoaux = Double.valueOf(digito);
                            digitoaux *= (-1);
                            digito = Double.toString(digitoaux);
                        }
                        break;
                    case '*':
                        operacionespendientes.add(Operacion.PRODUCTO);
                        break;
                    case '/':
                        operacionespendientes.add(Operacion.DIVISION);
                        break;
                    case '^':
                        operacionespendientes.add(Operacion.POTENCIA);
                        break;
                }
            }

            if (!digito.equals("")) {
                digitos.add(digito);
                digito = "";
            }
        }
    }

    private double evaluarExpresion(List<String> digitos, List<Operacion> operacionespendientes) {
        int posicionoperacion;

        for (int iteracion = 0; !digitos.isEmpty() && iteracion < prioridades.size(); iteracion++) {
            Operacion operaciondeturno = prioridades.get(iteracion);

            while (operacionespendientes.contains(operaciondeturno)) {

                posicionoperacion = operacionespendientes.indexOf(operaciondeturno);

                if (posicionoperacion != -1) {

                    double valor;

                    valor = evaluarOperacion(digitos.get(posicionoperacion), digitos.get(posicionoperacion + 1), operaciondeturno);
                    digitos.remove(posicionoperacion + 1);
                    digitos.set(posicionoperacion, Double.toString(valor));

                    operacionespendientes.remove(posicionoperacion);

                }
            }
        }
        double devolver = Double.parseDouble(digitos.get(0));
        operacionespendientes.clear();
        digitos.clear();
        return devolver;
    }

    private void introducirOperaciones() {
        // Aquí tengo que meter las posibles operaciones binarias que hay
        if (operacionesposibles.isEmpty()) {

            operacionesposibles.add("+");
            operacionesposibles.add("-");
            operacionesposibles.add("*");
            operacionesposibles.add("/");
            operacionesposibles.add("^");
        }
    }

    private void definirPrioridadOperaciones() {
        if (prioridades.isEmpty()) {

            prioridades.add(Operacion.POTENCIA);
            prioridades.add(Operacion.DIVISION);
            prioridades.add(Operacion.PRODUCTO);
            prioridades.add(Operacion.RESTA);
            prioridades.add(Operacion.SUMA);
        }
    }

    private String buscarExpresionParentesis(String operacion) {
        int posicioninicioparentesis;
        System.out.println("metodo -> buscarExpresionParentesis");
        posicioninicioparentesis = operacion.indexOf("(");

        while (posicioninicioparentesis != -1
                && operacion.charAt(posicioninicioparentesis - 1) != '+'
                && operacion.charAt(posicioninicioparentesis - 1) != '-'
                && operacion.charAt(posicioninicioparentesis - 1) != '*'
                && operacion.charAt(posicioninicioparentesis - 1) != '/'
                && operacion.charAt(posicioninicioparentesis - 1) != '^') {
            posicioninicioparentesis = operacion.indexOf("(", posicioninicioparentesis + 1);
        }

        if (posicioninicioparentesis != -1) {
            String suboperacion, trozoantesparentesis = "", trozodespuesparentesis = "", resultadoparentesis;
            int posicionfinalparentesis;

            posicionfinalparentesis = operacion.lastIndexOf(")");

            suboperacion = operacion.substring(posicioninicioparentesis + 1, posicionfinalparentesis);

            if (posicioninicioparentesis > 0) {
                trozoantesparentesis = operacion.substring(0, posicioninicioparentesis);
            }

            trozodespuesparentesis = operacion.substring(posicionfinalparentesis + 1, operacion.length());
            resultadoparentesis = Double.toString(resolverExpresion(suboperacion));
            operacion = trozoantesparentesis + resultadoparentesis + trozodespuesparentesis;

            operacionespendientes.clear();
            digitos.clear();
        }
        return operacion;
    }

    private double resolverExpresion(String expresion) {
        introducirOperaciones();
        definirPrioridadOperaciones();
        expresion = buscarExpresionParentesis(expresion);
        extraerDigitosOperaciones(expresion);
        return evaluarExpresion(digitos, operacionespendientes);
    }

    public Capturador<String, String> resolverValorExpresion(String expresion) {
        return new Capturador(Double.toString(resolverExpresion(expresion)), "");
    }

}
