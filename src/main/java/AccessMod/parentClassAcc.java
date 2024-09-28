package AccessMod;

public class parentClassAcc {

    public int pubNum = 30;
    private int privNum=40;
    protected int protNum=50;
    int defNum=60;

    public void pubMeth(){        System.out.println("Public Method");    }
    private void privMeth(){        System.out.println("Public Method");    }
    protected void protMeth(){        System.out.println("Public Method");    }
    void defMeth(){        System.out.println("Default Method");    }

}
