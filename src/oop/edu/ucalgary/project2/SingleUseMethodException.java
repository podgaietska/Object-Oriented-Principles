package oop.edu.ucalgary.project2;

class SingleUseMethodException extends Exception {
    public SingleUseMethodException() {
        super("Method can only be called once per instantiation");
    }
}
