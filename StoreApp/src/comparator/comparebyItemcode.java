package comparator;

import java.util.Comparator;

import com.store.app.Items;

public class comparebyItemcode implements Comparator<Items>{

	@Override
	public int compare(Items o1, Items o2) {
		// TODO Auto-generated method stub
		return o1.getItemCode().compareTo(o2.getItemCode());
	}
	

}
