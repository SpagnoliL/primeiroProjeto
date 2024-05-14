package com.example.exemplospring.ativirisBalla;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ativiri1 {
    @GetMapping("converte")
    public double exercicio1(@RequestParam String binario) {
        System.out.println(binario);
        int decimal = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }

    @GetMapping("roma")
    public double exercicio2(@RequestParam String roma) {
        int decimal = 0;
        for (int i = roma.length() - 1; i >= 0; i--) {
            String let = String.valueOf(roma.charAt(i));
            switch (let) {
                case "i" -> decimal += 1;
                case "x" -> decimal += 10;
                case "v" -> decimal += 5;
                case "l" -> decimal += 50;
                case "c" -> decimal += 100;
                case "d" -> decimal += 500;
                case "m" -> decimal += 1000;
            }
        }
        return decimal;
    }

    @GetMapping("fator")
    public double exercicio3(@RequestParam int fator) {
        int decimal = 1;
        for (int i = fator; i > 0; i--) {
            decimal = decimal * i;
        }
        return decimal;
    }

    @GetMapping("palavra")
    public String exercicio4(@RequestParam String pal1) {
        String pal2 = "";

        for (int i = pal1.length() - 1; i >= 0; i--) {
            pal2 += pal1.charAt(i);
        }
        if (pal1.equals(pal2)) {
            return "é um palíndromo";
        } else {
            return "não é um palíndromo";
        }
    }
    @GetMapping("temp")
    public String exercicio5(@RequestParam double celsius) {
        double farenheit = (celsius * 1.8)+32;
        double kelvin = celsius + 273;
        return ""+celsius+"°C equivalem à "+farenheit+"°F e "+kelvin+"°K.";
    }
    @GetMapping("notas")
    public String exercicio6(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3) {
        double media = (nota1+nota2+nota3)/3;
        return "A média das notas é:" + media;
    }
    @GetMapping("primos")
    public String exercicio7(@RequestParam double primo) {
        boolean primo1 = true;
        for(int j = 2;j<primo;j++) {
                if(primo%j == 0) {
                    primo1 = false;
                }
                if(primo1) {
                    return "O número " + primo + " é primo";
                } else {
                    return "O número "+primo+" não é primo";
                }}
        return "gg bois";
                }
    @GetMapping("horas")
    public String exercicio8(@RequestParam double horas) {
        double minutos = horas*60;
        return "(ué) "+horas+" horas são "+minutos+" minutos.";
    }
    @GetMapping("area")
    public String exercicio9(@RequestParam double altura, @RequestParam double base) {
        double area = (altura * base) / 2;
        return "A área desse triângulo é " + area;
    }
}
