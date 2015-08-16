package com.npsoftwares.time;

public class Time {

	private int hora;
	private int minutos;
	private int segundos;

	public Time() {
		this(0, 0, 0);
	}

	public Time(int h) {
		this(h, 0, 0);
	}

	public Time(int h, int m) {
		this(h, m, 0);
	}

	public Time(int h, int m, int s) {

		setHora(h);
		setMinutos(s);
		setSegundos(s);

	}
	
	public Time(Time time){
		
		this(time.getHora(),time.getMinutos(),time.getSegundos());
		
	}

   public void setTime(int h, int m, int s) {

		this.hora = ((h >= 0 && h <= 23) ? h : 0);
		this.minutos = ((m >= 0 && m < 60) ? m : 0);
		this.segundos = ((s >= 0 && s < 60) ? s : 0);
	}

	public String toUniversalFormat() {

		return String.format("%02d:%02d:%02d", this.hora, this.minutos,
				this.segundos);
	}

	@Override
	public String toString() {
		return String.format("%d:%02d:%02d %s", (this.hora == 0
				|| this.hora == 12 ? 12 : hora % 12), this.minutos,
				this.segundos, (hora < 12 ? "AM" : "PM"));
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

}
