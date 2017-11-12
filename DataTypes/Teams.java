/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;

/**
 *
 * @author halil
 */
public enum Teams {
    Adanaspor("Adanaspor"),
    Akhisar("Akhisar"),
    Alanyaspor("Alanyaspor"),
    Antalyaspor("Antalyaspor"),
    Beşiktaş("Beşiktaş"),
    Bursaspor("Bursaspor"),
    Rizespor("Rizespor"),
    Fenerbahçe("Fenerbahçe"),
    Galatasaray("Galatasaray"),
    Gaziantepspor("Gaziantepspor"),
    Genclerbirligi("Gençlerbirliği"),
    Istanbul_Basaksehir("Istanbul Başakşehir"),
    Karabukspor("Karabükspor"),
    Kasimpasa("Kasımpaşa"),
    Kayserispor("Kayserispor"),
    Konyaspor("Konyaspor"),
    Osmanlispor("Osmanlıspor"),
    Trabzonspor("Trabzonspor");
    private String TakimName;

    private Teams(String TakimName) {
        this.TakimName = TakimName;
    }

    @Override
    public String toString() {
        return this.TakimName; //To change body of generated methods, choose Tools | Templates.
    }

}
