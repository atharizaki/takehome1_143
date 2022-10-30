/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung.berhitung;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author athar
 */
@Controller
public class beliController {
    
    input data = new input();
    @RequestMapping("/miniso")
    public String Input(@RequestParam(value="Nama") String nama,
                        @RequestParam(value="Banyak") String jumlah,
                        @RequestParam(value="Total") String Harga,
                        Model model){
        int item, satuan, banyakBelanja, diskon, totalHarga;
        
        item = Integer.parseInt(jumlah);
        satuan = Integer.parseInt(Harga);
        
        banyakBelanja = data.banyakBelanja(satuan, item);
        totalHarga = data.diskon(satuan, item);
        diskon = data.Getdiskon(satuan, item);
        
        model.addAttribute("name", nama);
        model.addAttribute("banyak", item);
        model.addAttribute("total","Rp " +satuan);
        model.addAttribute("banyakBelanja", "Rp " +banyakBelanja);
        model.addAttribute("totalHarga", "Rp " +totalHarga);
        model.addAttribute("diskon", diskon + " %");
        
        return "viewdata";
    }
}
