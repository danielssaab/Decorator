package org.example;

class MotorTurbo extends CarroDecorator {
	public MotorTurbo(Carro carroDecorado) {
		super(carroDecorado);
	}

	@Override
	public double aceleracao() {
		return super.aceleracao() - 0.7;
	}
}