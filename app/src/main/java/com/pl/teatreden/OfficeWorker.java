package com.pl.teatreden;

public class OfficeWorker {
    String name;
    int imageResourceId;

    public OfficeWorker(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public static final OfficeWorker[] OFFICE_WORKERS = {
            new OfficeWorker("Łukasz Malec", R.drawable.mapa_lukasz),
            new OfficeWorker("Joanna Rola", R.drawable.mapa_joanna),
            new OfficeWorker("Ewa Porębska(Biuro/Księgowość)", R.drawable.ewa)
    };

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
