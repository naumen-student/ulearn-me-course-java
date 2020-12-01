package com.example.task02;

public class DiscountBill extends Bill {
    private final long _discount;

    public DiscountBill(long _discount) {
        super();
        if(_discount<0 || _discount>100) throw new ArithmeticException(
                String.format("Data normalize not possible. Input: %s", _discount));
        if(_discount>1){
            this._discount = _discount/100;
        }
        else
        {
            this._discount = _discount;
        }
    }

    @Override
    public long getPrice() {
        return super.getPrice()*(1-_discount);
    }

    public long getAbsoluteDiscount(){
        return super.getPrice() - getPrice();
    }

    public long getPercentDiscount(){
        return _discount*100;
    }
}
