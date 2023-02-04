package CoreJava;

import OOPs.CentralTraffic;

public class Australiantraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CentralTraffic a= new Australiantraffic();
     a.flashYellow();
     a.greenGo();
     a.redStop();
     
     Australiantraffic at = new Australiantraffic();
     ContinentalTraffic ct= new Australiantraffic();
     ct.trainSymbol();
     at.walkOnSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementation");
	}

	@Override
	public void walkOnSymbol() {
		// TODO Auto-generated method stub
		System.out.println("walkOnSymbol implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
