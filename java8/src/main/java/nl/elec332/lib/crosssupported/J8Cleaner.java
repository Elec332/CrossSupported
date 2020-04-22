package nl.elec332.lib.crosssupported;

import nl.elec332.lib.crosssupported.api.ICleaner;
import sun.misc.Cleaner;

/**
 * Created by Elec332 on 20-4-2020
 */
class J8Cleaner implements ICleaner {

    public J8Cleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    private final Cleaner cleaner;

    @Override
    public void clean() {
        this.cleaner.clean();
    }

}
