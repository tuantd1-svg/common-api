package com.example.commonapi.parameter.enumable;

public enum EPayment {
    COD,MOMO,OTHER;
    public static EPayment getPayment(String payment)
    {
        for (EPayment e : EPayment.values()) {
            if (e.name().equals(payment))
                return e;
        }
        return null;
    }



}
