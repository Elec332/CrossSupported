package nl.elec332.lib.crosssupported;

import nl.elec332.lib.crosssupported.api.ICleaner;

import java.lang.ref.Cleaner;

/**
 * Created by Elec332 on 20-4-2020
 */
class J9Cleaner implements ICleaner {

    public J9Cleaner(Cleaner.Cleanable cleaner) {
        this.cleaner = cleaner;
    }

    private final Cleaner.Cleanable cleaner;

    @Override
    public void clean() {
        this.cleaner.clean();
    }

}
