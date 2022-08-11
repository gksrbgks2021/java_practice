package day03;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	TV() {
		this(7, 20, false);
	}

	TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void volumeUp() {
		this.volume++;
	}

	public void volumeDown() {
		this.volume--;
	}

	public void powerOn() {
		this.power = true;
	}

	public void powerOff() {
		this.power = false;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getChannel() {
		return this.channel;
	}

	public boolean isPower() {
		return this.power;
	}

	public int getVolume() {
		return this.volume;
	}
	public void show() {
		System.out.printf("ä�� : %d ���� : %d �Ŀ� : %b",this.getVolume(),this.getChannel(),this.isPower());
	}
}
