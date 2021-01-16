package model;

public enum ResponseCode {
    SUCCESS(0);
    private int value;
    ResponseCode(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
