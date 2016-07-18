package com.directi.inheritance.polymorphism;

public class Router {

    public void route(XmlPacket xmlPacket) {
        String serializedValue = serializeXmlPacket(xmlPacket);
        deliver(serializedValue);
    }

    public void route(JsonPacket jsonPacket) {

        String serializedValue = serializeJsonPacket(jsonPacket);

        deliver(serializedValue);
    }

    public void route(NinjaPacket jsonPacket) {

        String serializedValue = serializeNinjaPacket(jsonPacket);

        deliver(serializedValue);
    }

    private String serializeNinjaPacket(NinjaPacket jsonPacket) {
        return null;
    }


    private String serializeJsonPacket(JsonPacket jsonPacket) {
        return null;
    }

    private String deliver(String serializedValue) {
        //do some operation on XMl packet
        return "serialized json value";
    }


    private String serializeXmlPacket(XmlPacket xmlPacket) {
        //do some operation on XMl packet
        return "serialized xml value";
    }
}
