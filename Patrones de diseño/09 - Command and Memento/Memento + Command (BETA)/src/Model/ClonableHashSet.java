package Model;

import java.util.TreeSet;

@SuppressWarnings("serial")
public class ClonableHashSet<E extends IClonable> extends TreeSet<E> implements IClonable {

        @Override
	public ClonableHashSet<E> cloneThis() {
		ClonableHashSet<E> cloned = new ClonableHashSet<>();
                this.forEach((clonable) -> {
                    cloned.add((E) clonable.cloneThis());
            });
		return cloned;
	}
}
 