/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

/**
 *
 * @author joaod
 */
public class dia_hoje {

    private int AnoFIXO = 0, MesFIXO = 0,DiaFIXO = 0;
    public dia_hoje(){
    
    DiaFIXO = Principal.mes.jCalendar1.getDayChooser().getDay();
    AnoFIXO = Principal.mes.jCalendar1.getYearChooser().getYear();
    MesFIXO = Principal.mes.jCalendar1.getMonthChooser().getMonth();
    
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
