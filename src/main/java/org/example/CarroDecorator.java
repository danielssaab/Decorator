package org.example;

abstract class CarroDecorator implements Carro {
	protected Carro carroDecorado;

	public CarroDecorator(Carro carroDecorado) {
		this.carroDecorado = carroDecorado;
	}

	@Override
	public double aceleracao() {
		return carroDecorado.aceleracao();
	}
}