package by.it.romanova.at08;

class Patterns {

    static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    static final String VECTOR = "\\{((-?[0-9]+(\\.[0-9]+)?),?)+}";
    static final String MATRIX = "\\{(\\{((-?[0-9]+(\\.[0-9]+)?),?)+},?)+}";
    static final String OPERATION = "[-+*/]";

}
