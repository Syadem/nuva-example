package com.syadem;

import com.syadem.nuva.*;
import java.io.IOException;

public class NuvaSample {

  public static void main(String[] args) throws IOException {
    /* Télécharge la NUVA en anglais via le CDN */
    NUVA nuva = NUVA.load(SupportedLocale.English);

    /* Récupère le vaccin ayant comme code NUVA 43 */
    Vaccine vaccine = nuva.getQueries().lookupVaccineByCode(43);

    /* Affiche le nom en anglais du vaccin */
    System.out.println(vaccine.getName());
  }
}
