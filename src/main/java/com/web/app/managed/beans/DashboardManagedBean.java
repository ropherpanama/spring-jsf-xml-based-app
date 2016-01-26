package com.web.app.managed.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.web.app.model.Mensaje;
import com.web.app.services.MensajeServicio;

@ManagedBean
@SessionScoped
public class DashboardManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{MensajeServicio}")
	MensajeServicio servicio;
	private List<Mensaje> mensajes;

	@PostConstruct
	public void init() {
//		mensajes = new ArrayList<Mensaje>();
		mensajes = servicio.list();
	}

	public MensajeServicio getServicio() {
		return servicio;
	}

	public void setServicio(MensajeServicio servicio) {
		this.servicio = servicio;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
}
