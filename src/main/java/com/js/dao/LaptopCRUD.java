package com.js.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.js.dto.Laptop;

@Component
public class LaptopCRUD {
	
	@Autowired
	EntityManagerFactory emf;
	
	public boolean insert(Laptop l) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(l);
		et.commit();
		
		Laptop result = em.find(Laptop.class, l.getId());
		
		if(result!=null) {
			return true;
		}
		return false;
	}
	
	public Laptop getLaptopbyId(int id) {
	EntityManager em = emf.createEntityManager();
	
	return em.find(Laptop.class, id);	
	}
	
	public boolean deleteLaptop(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Laptop la= em.find(Laptop.class, id);
		if(la!=null) {
			et.begin();
			em.remove(la);
			et.commit();
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean updateLaptop(int id,Laptop newLaptop) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Laptop lt=em.find(Laptop.class, id);
		
		if(lt!=null) {
			newLaptop.setId(lt.getId());
			et.begin();
			em.merge(newLaptop);
			et.commit();
			return true;
		}
		else {
			return false;
		}
	}
	public List<Laptop> getallLaptops(){
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select la from Laptop la");  // entity class laptop la
		return q.getResultList();
		
		
	}
}
