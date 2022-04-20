
package learningjdbc_app.dominio.mywines;

public class MyWines {
    
    protected int id;
    protected String wineryName;
    protected String wineLabelName;
    protected int vintage;
    protected SensorialTasting sensesAnalysis;

    public MyWines() {
    }

    public MyWines(int id, String wineryName, String wineLabelName, int vintage, SensorialTasting sensesAnalysis) {
        this.id = id;
        this.wineryName = wineryName;
        this.wineLabelName = wineLabelName;
        this.vintage = vintage;
        this.sensesAnalysis = sensesAnalysis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWineryName() {
        return wineryName;
    }

    public void setWineryName(String wineryName) {
        this.wineryName = wineryName;
    }

    public String getWineLabelName() {
        return wineLabelName;
    }

    public void setWineLabelName(String wineLabelName) {
        this.wineLabelName = wineLabelName;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public SensorialTasting getSensesAnalysis() {
        return sensesAnalysis;
    }

    public void setSensesAnalysis(SensorialTasting sensesAnalysis) {
        this.sensesAnalysis = sensesAnalysis;
    }

    @Override
    public String toString() {
        return "MyWines{" + "id=" + id + ", wineryName=" + wineryName + ", wineLabelName=" + wineLabelName + ", vintage=" + vintage + ", sensesAnalysis=" + sensesAnalysis + '}';
    }
    
    
    
    
    
    
    
    
}

/*  
# id	wineryName	wineLabelName	vintage
1	Pulenta Estate	Pinot Noir	2020
2	Finca Las Nubes	Torrontes	2021
3	Chandon	Extra Brut	
4	Pulenta Estate	Cabernet Sauvignon	2018
5	Mendel	Cabernet Sauvignon	2018
6	Achaval Ferrer	Cabernet Sauvignon	2019

*/