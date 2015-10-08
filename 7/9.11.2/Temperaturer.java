class Temperaturer {
	private int dager;
	private int[][] temperatur; 
	
	public Temperaturer() {
		dager = 30;
		temperatur = new int[dager][24];
	}
	
	public Temperaturer(int dager) {
		this.dager = dager;
		temperatur = new int[dager][24];
	}
	
	public void setTemp(int dag, int time, int temp) {
		temperatur[dag][time] = temp;
	}
	
	public int[] getTempDag() {
		int[] middelTemp = new int[dager];
		for (int i = 0; i < dager; i++) {
			for (int j = 0; j < 24; j++) {
				middelTemp[i] += temperatur[i][j];
			}
			middelTemp[i] /= 24;
		}
		return middelTemp;
	}
	
	public int[] getTempTime() {
		int[] middelTemp = new int[24];
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < dager; j++) {
				middelTemp[i] += temperatur[j][i];
			}
			middelTemp[i] /= dager;
		}
		return middelTemp;
	}
	
	public int getTempManed() {
		int[] middelTemp = getTempDag();
		int manedTemp = 0;
		for (int i = 0; i < middelTemp.length; i++) {
			manedTemp += middelTemp[i];
		}
		manedTemp /= middelTemp.length;
		return manedTemp;
	}
	
	public int[] tempKategori() {
		int[] middelTemp = getTempDag();
		int[] kategori = new int[5];
		
		for (int i = 0; i < middelTemp.length; i++) {
			if (middelTemp[i] < -5) {
				kategori[0]++;
			} else if (middelTemp[i] < 0) {
				kategori[1]++;
			} else if (middelTemp[i] < 5) {
				kategori[2]++;
			} else if (middelTemp[i] < 10) {
				kategori[3]++;
			} else {
				kategori[4]++;
			}
		}
		
		return kategori;
	}
}