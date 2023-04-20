package org.stone.design.service;

import org.junit.Test;
import org.stone.design.service.impl.CalculationAreaExt;

public class ApiTest {
    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }
}
