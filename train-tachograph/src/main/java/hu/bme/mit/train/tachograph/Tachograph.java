package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tachograph {
	Table<Long, Integer, Integer> table;

	public Tachograph() {
		table = HashBasedTable.create();
	}

	public void record(int joyStickPosition, int referenceSpeed) {
		table.put(System.currentTimeMillis(), joyStickPosition, referenceSpeed);
	}

	public boolean isTableEmpty() {
		return table.isEmpty();
	}
}