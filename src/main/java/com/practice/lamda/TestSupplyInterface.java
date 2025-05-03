package com.practice.lamda;

import java.util.function.Supplier;

class SupplyInterfaceImpl implements Supplier<Integer> {

    @Override
    public Integer get() {
        return 100;
    }
}

public class TestSupplyInterface {
    public static void main(String[] args) {
        SupplyInterfaceImpl supplyInterfaceImpl = new SupplyInterfaceImpl();
        System.out.println(supplyInterfaceImpl.get());
    }
}
