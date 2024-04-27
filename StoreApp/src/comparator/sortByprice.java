package comparator;

import java.util.Comparator;

import com.store.app.Items;

public class sortByprice implements Comparator<Items> {

	@Override
	public int compare(Items o1, Items o2) {
		// TODO Auto-generated method stub
		return   (int) (o1.getPrice()-o2.getPrice());
	}

}
