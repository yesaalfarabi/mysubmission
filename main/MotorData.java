package com.example.mysubmission;

import java.util.ArrayList;

public class MotorData
{   public static String[][] Data = new String[][]
        {       { "Yamaha Xride 125","https://www.yamaha-motor.co.id/uploads/products/featured_image/Ehn0gOEYjXY7XkjqoAOR.png"},
                { "Yamaha N-Max","https://www.yamaha-motor.co.id/uploads/products/featured_image/6sMOLKc9GTs5GylEPySu.png"},
                { "Yamaha Fino Grande","https://www.yamaha-motor.co.id/uploads/products/featured_image/KtkpmU4PBsWOyMLy2REe.png"},
                { "Yamaha Soul GT AKS","https://www.yamaha-motor.co.id/uploads/products/featured_image/RAcww8xbSxgpiB0xBEc3.png"},
                { "Yamaha Jupiter MX","https://www.yamaha-motor.co.id/uploads/products/featured_image/lN7XoxEQ6UUmlzVc1idu.png"},
                { "Yamaha MT 15","https://www.yamaha-motor.co.id/uploads/products/featured_image/9CsaV5txzjowVxQlCDTI.png"},
                { "Yamaha Mio M3","https://www.yamaha-motor.co.id/uploads/products/featured_image/ZB5k7hayKeStw0AnbdJz.png"},
                { "Yamaha Freego S ABS","https://www.yamaha-motor.co.id/uploads/products/featured_image/xGWpPJSS8uQG53UGSRCk.png"},
                { "Yamaha R15","https://www.yamaha-motor.co.id/uploads/products/featured_image/if63pKfrP24S5aM9MGev.png"},
                { "Yamaha Mio S","https://www.yamaha-motor.co.id/uploads/products/tCpouemtB8EzqgRjVmQ7.png"}
        };

    public static ArrayList<Motor> getListData()
    {   Motor motor = null;
        ArrayList<Motor> list = new ArrayList<>();
        for (String [] aMotor:Data)
        {   motor = new Motor();
            motor.setName(aMotor[0]);
            motor.setPhoto(aMotor[1]);
            list.add(motor);
        }
        return list;
    }
}

