/*
 * Copyright (c) 2013 University of Tartu
 */
package org.jpmml.evaluator;

import java.util.*;

import org.jpmml.manager.*;

import org.dmg.pmml.*;

public class ModelManagerEvaluationContext extends EvaluationContext {

	private ModelManager<?> modelManager = null;


	public ModelManagerEvaluationContext(ModelManager<?> modelManager, Map<FieldName, ?> arguments){
		super(arguments);

		setModelManager(modelManager);
	}

	@Override
	public DerivedField resolve(FieldName name){
		ModelManager<?> modelManager = getModelManager();

		return modelManager.resolve(name);
	}

	@Override
	public ModelManagerEvaluationContext clone(){
		return (ModelManagerEvaluationContext)super.clone();
	}

	public ModelManager<?> getModelManager(){
		return this.modelManager;
	}

	private void setModelManager(ModelManager<?> modelManager){
		this.modelManager = modelManager;
	}
}