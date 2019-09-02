package basicsOfOOP.gift;

import basicsOfOOP.gift.date.DataInFile;
import basicsOfOOP.gift.packages.Packaging;
import basicsOfOOP.gift.packages.PackagingCreate;
import basicsOfOOP.gift.sweet.Sweets;
import basicsOfOOP.gift.sweet.SweetsCreate;
import basicsOfOOP.gift.type.PackagingType;
import basicsOfOOP.gift.type.SweetsOfType;
import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

//Готовый подарок
class ReadyMadeGift {

    private Packaging pack;
    private ArrayList<Sweets> sweets;

    public Packaging getPack() {
        return pack;
    }

    public void setPack(Packaging pack) {
        this.pack = pack;
    }

    public ArrayList<Sweets> getSweets(){
        return sweets;
    }

    public void setSweets(ArrayList<Sweets> sweets) {
        this.sweets = sweets;
    }


    public ArrayList<Sweets> createGift() throws IOException {

        SweetsCreate sweetsCreate = new SweetsCreate();
        ArrayList<Sweets> sweets = new ArrayList<>();

        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("LogFileGift");
        logger.addHandler(fh);
        BufferedReader reader = new BufferedReader(new FileReader("gift"));

        String line;
        String [] words;

        Sweets sweet = null;
        int count = 1;

        while ((line = reader.readLine()) != null) {
            DataInFile validator = new DataInFile();
            try {
                validator.validate(line);
                words = line.split("\\s+");
                sweet = sweetsCreate.createSweet(sweetsCreate.getSweetsOfType(words[0].toLowerCase()),
                         Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                sweets.add(sweet);
            } catch (GiftException e) {
                System.out.println(e.getMessage() + "in string " + count);
                logger.log(Level.WARNING, e.getMessage());
            }
            count++;
        }
        return sweets;
    }

    public void printAll() {
        for (int i = 0; i < sweets.size(); i++) {
            System.out.println(sweets.get(i));
        }
    }

    public Sweets getSweetsForClient(SweetsOfType type, int count) throws Exception {

        Sweets sweet = null;
        SweetsCreate sweetsCreate = new SweetsCreate();

        for (int i = 0; i < sweets.size(); i++) {

            if (!type.equals(null)) {
                    if (count != 0) {
                        if (sweets.get(i).getSweetsType().equals(type)) {
                            if (sweets.get(i).getCount() >= count) {
                                sweet = sweetsCreate.createSweet(sweets.get(i).getSweetsType(), count,
                                        sweets.get(i).getPrice());

                                sweets.get(i).setCount(sweets.get(i).getCount() - count);
                                break;
                            } else {
                                System.out.println("В магазине " + sweets.get(i).getCount() + " конфет этого типа.");
                            }
                        }
                    }
            }
        }
        return sweet;
    }

    public Packaging getPackageForSweets(PackagingType pack) {

        PackagingCreate packagingCreate = new PackagingCreate();

        Packaging packageForSweets = packagingCreate.createPackaging(pack, packagingCreate.getPriceOfPackage(pack));

        return packageForSweets;
    }

    public static void printForClient (ArrayList<Sweets> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public int cost() {
        int cost = 0;
        for (int i = 0; i < sweets.size(); i++) {
            cost += sweets.get(i).costSweets();
        }
        return cost + pack.getPrice();
    }
}
