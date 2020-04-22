package nl.elec332.lib.crosssupported.api;

/**
 * Created by Elec332 on 20-4-2020
 */
public interface ICrossSupport {

    IUnsafe getTheUnsafe();

    ICleaner createCleaner(Object ref, Runnable callback);

}
