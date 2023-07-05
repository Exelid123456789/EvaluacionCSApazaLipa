/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda_modelo;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlAdapter;
/**
 *
 * @author Xeride
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate>{
     @Override
    public LocalDate unmarshal(String v) throws Exception {
        return LocalDate.parse(v);
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        return v.toString();
    }
}
