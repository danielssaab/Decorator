package org.example;

class CarroBase implements Carro {
	@Override
	public double aceleracao() {
		// O carro base leva 10 segundos para alcançar 100 km/h
		return 10.0;
	}
}