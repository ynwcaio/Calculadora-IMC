package Controller;

import static View.Imc_GUI.altura_txt;
import static View.Imc_GUI.ico_img;
import static View.Imc_GUI.ico2_img;
import static View.Imc_GUI.ico3_img;
import static View.Imc_GUI.ico4_img;
import static View.Imc_GUI.ico5_img;
import static View.Imc_GUI.ico6_img;
import static View.Imc_GUI.peso_txt;
import static View.Imc_GUI.r2_txt;
import static View.Imc_GUI.r_txt;
import java.text.DecimalFormat;


public class CALCULA_DAO{
    
    public static double peso, altura, imc;
    
    public static void calcula(){
        
        peso = Double.parseDouble(peso_txt.getText());
        altura = Double.parseDouble(altura_txt.getText());
        imc = peso / (altura*altura);
        DecimalFormat df = new DecimalFormat("0.00"); 
        r_txt.setText(String.valueOf(df.format(imc)));
        
        
        if(imc < 18.5){
            r2_txt.setText(String.valueOf("ABAIXO DO PESO"));
            ico_img.setVisible(true);
            ico2_img.setVisible(false);
            ico3_img.setVisible(false);
            ico4_img.setVisible(false);
            ico5_img.setVisible(false);
            ico6_img.setVisible(false);
        }else if(imc < 24.9){
            r2_txt.setText(String.valueOf("PESO NORMAL"));
            ico_img.setVisible(false);
            ico2_img.setVisible(true);
            ico3_img.setVisible(false);
            ico4_img.setVisible(false);
            ico5_img.setVisible(false);
            ico6_img.setVisible(false);
        }else if(imc < 29.9){
            r2_txt.setText(String.valueOf("SOBREPESO"));
            ico_img.setVisible(false);
            ico2_img.setVisible(false);
            ico3_img.setVisible(true);
            ico4_img.setVisible(false);
            ico5_img.setVisible(false);
            ico6_img.setVisible(false);
        }else if(imc < 34.9){
            r2_txt.setText(String.valueOf("OBESIDADE LEVE"));
            ico_img.setVisible(false);
            ico2_img.setVisible(false);
            ico3_img.setVisible(false);
            ico4_img.setVisible(true);
            ico5_img.setVisible(false);
            ico6_img.setVisible(false);
        }else if(imc < 39.9){
            r2_txt.setText(String.valueOf("OBESIDADE MODERADA"));
            ico_img.setVisible(false);
            ico2_img.setVisible(false);
            ico3_img.setVisible(false);
            ico4_img.setVisible(false);
            ico5_img.setVisible(true);
            ico6_img.setVisible(false);
        }else{
            r2_txt.setText(String.valueOf("OBESIDADE MÓRBIDA"));
            ico_img.setVisible(false);
            ico2_img.setVisible(false);
            ico3_img.setVisible(false);
            ico4_img.setVisible(false);
            ico5_img.setVisible(false);
            ico6_img.setVisible(true);
        }
    }

    public static void limpa(){
        peso_txt.setText("");
        altura_txt.setText("");
        r_txt.setText("");
        r2_txt.setText("");
        ico_img.setVisible(false);
        ico2_img.setVisible(false);
        ico3_img.setVisible(false);
        ico4_img.setVisible(false);
        ico5_img.setVisible(false);
        ico6_img.setVisible(false);
    }
}
