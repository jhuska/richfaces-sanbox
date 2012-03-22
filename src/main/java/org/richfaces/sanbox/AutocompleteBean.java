package org.richfaces.sanbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AutocompleteBean {
	private String value;

	private List<City> cities;

	public AutocompleteBean() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		cities = new ArrayList<City>();
		cities.add(new City("Bratislava"));
		cities.add(new City("London"));
		cities.add(new City("Brusels"));
		cities.add(new City("Paris"));
		cities.add(new City("Budapest"));
		cities.add(new City("Brezno"));
		cities.add(new City("Budejovice"));
	}

	public List<City> autocomplete(String prefix) {
		ArrayList<City> result = new ArrayList<City>();

		Iterator<City> iterator = cities.iterator();
		while (iterator.hasNext()) {
			City elem = ((City) iterator.next());
			if ((elem != null && elem.getName().toLowerCase()
					.indexOf(prefix.toLowerCase()) == 0)
					|| "".equals(prefix)) {
				result.add(elem);
			}
		}

		return result;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public class City {

		private String name;

		public City(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
