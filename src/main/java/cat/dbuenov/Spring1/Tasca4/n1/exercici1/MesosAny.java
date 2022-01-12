package cat.dbuenov.Spring1.Tasca4.n1.exercici1;

import java.util.ArrayList;


public class MesosAny {
	
	private ArrayList<Month> mesos;
	
	public MesosAny() {
		this.mesos = new ArrayList<Month>();
		Month gener    = new Month("gener");
		Month febrer   = new Month("febrer");
		Month març     = new Month("març");
		Month abril    = new Month("abril");
		Month maig     = new Month("maig");
		Month juny     = new Month("juny");
		Month juliol   = new Month("juliol");
		Month agost    = new Month("agost");
		Month setembre = new Month("setembre");
		Month octubre  = new Month("octubre");
		Month novembre = new Month("novembre");
		Month decembre = new Month("decembre");
		
		this.mesos.add(gener);
		this.mesos.add(febrer);
		this.mesos.add(març);
		this.mesos.add(abril);
		this.mesos.add(maig);
		this.mesos.add(juny);
		this.mesos.add(juliol);
		this.mesos.add(agost);
		this.mesos.add(setembre);
		this.mesos.add(octubre);
		this.mesos.add(novembre);
		this.mesos.add(decembre);
		
	}

	public ArrayList<Month> getMesos() {
		return mesos;
	}	
	
}
