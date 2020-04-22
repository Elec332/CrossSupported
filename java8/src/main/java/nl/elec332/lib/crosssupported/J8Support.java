package nl.elec332.lib.crosssupported;

import nl.elec332.lib.crosssupported.api.ICleaner;
import nl.elec332.lib.crosssupported.api.ICrossSupport;
import nl.elec332.lib.crosssupported.api.IUnsafe;
import sun.misc.Cleaner;

/**
 * Created by Elec332 on 20-4-2020
 */
class J8Support implements ICrossSupport {

    private static final IUnsafe UNSAFE;

    @Override
    public IUnsafe getTheUnsafe() {
        return UNSAFE;
    }

    @Override
    public ICleaner createCleaner(Object ref, Runnable callback) {
        return new J8Cleaner(Cleaner.create(ref, callback));
    }

    static {
        UNSAFE = new CommonUnsafe();
    }

}
