/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.noaa.nws.iris.commons;

/**
 *
 * @author Jason.Burks
 */
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class UUIDGenerator implements IdentifierGenerator {

    public String generate(SessionImplementor session, Object parent) throws HibernateException {
        return UUID.randomUUID().toString();
    }
}
