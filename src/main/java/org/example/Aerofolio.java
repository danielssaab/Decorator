package org.example;

class Aerofolio extends CarroDecorator {
	public Aerofolio(Carro carroDecorado) {
		super(carroDecorado);
	}

	@Override
	public double aceleracao(){
		return super.aceleracao() - 0.5;
	}
}