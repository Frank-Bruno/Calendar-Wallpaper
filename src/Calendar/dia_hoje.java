/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author joaod
 */
public class dia_hoje {
    private int AnoFIXO = 0, MesFIXO = 0, DiaFIXO = 0;
    public dia_hoje(){
    SimpleDateFormat Dia = new SimpleDateFormat("dd");
    SimpleDateFormat Mes = new SimpleDateFormat("MM");
    SimpleDateFormat Ano = new SimpleDateFormat("YYYY");
       
    DiaFIXO = Integer.parseInt(Dia.format(new Date()));
    AnoFIXO = Integer.parseInt(Ano.format(new Date()));
    MesFIXO = Integer.parseInt(Mes.format(new Date()));
    
    
       }
    public int DiaFixo(){
        return DiaFIXO;
    }
    public int AnoFixo(){
        return AnoFIXO;
    }
    public int MesFixo(){
        return MesFIXO;
    }
}
