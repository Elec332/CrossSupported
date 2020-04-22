package nl.elec332.lib.crosssupported;

import nl.elec332.lib.crosssupported.api.ICleaner;
import nl.elec332.lib.crosssupported.api.ICrossSupport;
import nl.elec332.lib.crosssupported.api.IUnsafe;

import java.lang.ref.Cleaner;

/**
 * Created by Elec332 on 20-4-2020
 */
class J9Support implements ICrossSupport {

    private static final IUnsafe UNSAFE;
    private static final Cleaner CLEANER;

    @Override
    public IUnsafe getTheUnsafe() {
        return UNSAFE;
    }

    @Override
    public ICleaner createCleaner(Object ref, Runnable callback) {
        return new J9Cleaner(CLEANER.register(ref, callback));
    }

    static {
        UNSAFE = new CommonUnsafe();
        CLEANER = Cleaner.create();
    }

}
