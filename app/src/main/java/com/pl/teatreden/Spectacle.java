package com.pl.teatreden;

public class Spectacle {
    private String name;
    private int description;
    private int imageResourceId;

    public Spectacle(String name, int description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public static final Spectacle [] performances = {
            new Spectacle("Najlepszy Przyjaciel",R.string.najlepszy_przyjaciel_descrtiption, R.drawable.najlepszy_przyjaciel1),
            new Spectacle("Najpiękniejszy Prezent",R.string.najpiękniejszy_prezent_description, R.drawable.prezent1),
            new Spectacle("Ukryte Bogactwo", R.string.ukryte_bogactwo_description, R.drawable.ukryte_bogactwo),
            new Spectacle("Opowieść o dobrym człowieku", R.string.samarytanin_description, R.drawable.opowiesc_o_dobrym_czlowieku),
            new Spectacle("Arka Noego", R.string.arka_noego_description, R.drawable.arka1),
            new Spectacle("Historia Daniela w jaskini Lwów", R.string.daniel_w_jaskini_description, R.drawable.daniel_w_jaskini),
            new Spectacle("Jonasz i niezwykła Ryba", R.string.jonasz_description, R.drawable.jonasz1),
            new Spectacle("Legenda o św. Mikołaju Biskupie", R.string.legenda_description, R.drawable.legenda1),
            new Spectacle("Odważny Pastuszek", R.string.odwazny_pastuszek_desription, R.drawable.odwazny1),
            new Spectacle("Opowieść Wigilijna", R.string.opowieść_wigilijna_description, R.drawable.opowiesc_wigilijna),
            new Spectacle("Prawdziwy Skarb", R.string.prawdziwy_skarb_description, R.drawable.prawdziwy_skarb),
            new Spectacle("Przypowieść o Talentach", R.string.talenty_description, R.drawable.talenty1),
            new Spectacle("Zagubiona Owieczka", R.string.owieczka_description, R.drawable.owieczka),
            new Spectacle("Wizyta św. Mikołaja", R.string.sw_mikołaj_description, R.drawable.mikolaj)
    };

    public String getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


}
