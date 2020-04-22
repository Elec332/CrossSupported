package nl.elec332.lib.crosssupported;

import nl.elec332.lib.crosssupported.api.ICrossSupport;

/**
 * Created by Elec332 on 20-4-2020
 */
public class CrossSupport {

    public static final ICrossSupport INSTANCE;

    static {
        INSTANCE = new J8Support();
    }

}
