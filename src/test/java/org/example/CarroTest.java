package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

	@Test
	void deveRetornarAceleracaoCarroBase() {
		Carro carro = new CarroBase();
		assertEquals(10.0, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolio() {
		Carro carro = new Aerofolio(new CarroBase());
		assertEquals(9.5, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateral() {
		Carro carro = new SaiaLateral(new CarroBase());
		assertEquals(9.7, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComRodasLigaLeve() {
		Carro carro = new RodasLigaLeve(new CarroBase());
		assertEquals(9.2, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComMotorTurbo() {
		Carro carro = new MotorTurbo(new CarroBase());
		assertEquals(9.3, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new CarroBase());
		assertEquals(9.6, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioESaiaLateral() {
		Carro carro = new SaiaLateral(new Aerofolio(new CarroBase()));
		assertEquals(9.2, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioERodasLigaLeve() {
		Carro carro = new RodasLigaLeve(new Aerofolio(new CarroBase()));
		assertEquals(8.7, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioEMotorTurbo() {
		Carro carro = new MotorTurbo(new Aerofolio(new CarroBase()));
		assertEquals(8.8, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new Aerofolio(new CarroBase()));
		assertEquals(9.1, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateralERodasLigaLeve() {
		Carro carro = new RodasLigaLeve(new SaiaLateral(new CarroBase()));
		assertEquals(8.9, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateralEMotorTurbo() {
		Carro carro = new MotorTurbo(new SaiaLateral(new CarroBase()));
		assertEquals(9.0, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateralEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new SaiaLateral(new CarroBase()));
		assertEquals(9.2, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComRodasLigaLeveEMotorTurbo() {
		Carro carro = new MotorTurbo(new RodasLigaLeve(new CarroBase()));
		assertEquals(8.5, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComRodasLigaLeveEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new RodasLigaLeve(new CarroBase()));
		assertEquals(8.8, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComMotorTurboEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new MotorTurbo(new CarroBase()));
		assertEquals(8.9, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioSaiaLateralERodasLigaLeve() {
		Carro carro = new RodasLigaLeve(new SaiaLateral(new Aerofolio(new CarroBase())));
		assertEquals(8.4, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioSaiaLateralEMotorTurbo() {
		Carro carro = new MotorTurbo(new SaiaLateral(new Aerofolio(new CarroBase())));
		assertEquals(8.5, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioSaiaLateralEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new SaiaLateral(new Aerofolio(new CarroBase())));
		assertEquals(8.8, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioRodasLigaLeveEMotorTurbo() {
		Carro carro = new MotorTurbo(new RodasLigaLeve(new Aerofolio(new CarroBase())));
		assertEquals(8.0, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioRodasLigaLeveEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new RodasLigaLeve(new Aerofolio(new CarroBase())));
		assertEquals(8.3, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioMotorTurboEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new MotorTurbo(new Aerofolio(new CarroBase())));
		assertEquals(8.4, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateralRodasLigaLeveEMotorTurbo() {
		Carro carro = new MotorTurbo(new RodasLigaLeve(new SaiaLateral(new CarroBase())));
		assertEquals(8.2, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateralRodasLigaLeveEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new RodasLigaLeve(new SaiaLateral(new CarroBase())));
		assertEquals(8.5, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComSaiaLateralMotorTurboEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new MotorTurbo(new SaiaLateral(new CarroBase())));
		assertEquals(8.6, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComRodasLigaLeveMotorTurboEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new MotorTurbo(new RodasLigaLeve(new CarroBase())));
		assertEquals(8.1, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioSaiaLateralRodasLigaLeveEMotorTurbo() {
		Carro carro = new MotorTurbo(new RodasLigaLeve(new SaiaLateral(new Aerofolio(new CarroBase()))));
		assertEquals(7.7, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioSaiaLateralRodasLigaLeveEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new RodasLigaLeve(new SaiaLateral(new Aerofolio(new CarroBase()))));
		assertEquals(8.0, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioSaiaLateralMotorTurboEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new MotorTurbo(new SaiaLateral(new Aerofolio(new CarroBase()))));
		assertEquals(8.1, carro.aceleracao(),0.1);
	}

	@Test
	void deveRetornarAceleracaoCarroComAerofolioRodasLigaLeveMotorTurboEEscapamentoEsportivo() {
		Carro carro = new EscapamentoEsportivo(new MotorTurbo(new RodasLigaLeve(new Aerofolio(new CarroBase()))));
		assertEquals(7.6, carro.aceleracao(),0.1);
	}
}
