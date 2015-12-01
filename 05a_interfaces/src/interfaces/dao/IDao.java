package interfaces.dao;

import java.util.ArrayList;

import interfaces.beans.Film;

public interface IDao {
	public ArrayList<Film> getAll();
	public Film getOne(int id);
	public void delete(int id);
	public void add(Film film);
	public void update(Film film);
}
