package comparing;

import java.util.Comparator;

import com.app.cricketer.CricketPlayer;

public class comparingByrating implements Comparator<CricketPlayer>{

	@Override
	public int compare(CricketPlayer o1, CricketPlayer o2) {
		
		return o1.getRating()-o2.getRating();
	}

}
