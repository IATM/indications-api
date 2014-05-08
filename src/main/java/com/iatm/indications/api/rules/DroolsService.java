package com.iatm.indications.api.rules;

import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class DroolsService {
    private static KnowledgeBase knowledgeBase;

    static {
        KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        builder.add(ResourceFactory.newClassPathResource("indications.drl"), ResourceType.DRL);
        if (builder.hasErrors()) {
            throw new RuntimeException(builder.getErrors().toString());
        }

        knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
        knowledgeBase.addKnowledgePackages(builder.getKnowledgePackages());
    }

    public void evaluate(List<Object> facts) {
        StatefulKnowledgeSession session = null;
        try {
            session = knowledgeBase.newStatefulKnowledgeSession();
            session.setGlobal("childAge", 12);

            for (Object fact : facts)
                session.insert(fact);
            session.fireAllRules();
        } finally {
            if (session != null)
                session.dispose();
        }
    }

}
