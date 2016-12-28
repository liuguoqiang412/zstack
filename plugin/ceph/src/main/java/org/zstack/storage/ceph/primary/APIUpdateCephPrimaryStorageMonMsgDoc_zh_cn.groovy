package org.zstack.storage.ceph.primary



doc {
    title "在这里填写API标题"

    desc "在这里填写API描述"

    rest {
        request {
            url "PUT /v1/primary-storage/ceph/mons/{monUuid}/actions"

            header (OAuth: 'the-session-uuid')

            clz APIUpdateCephPrimaryStorageMonMsg.class

            desc ""
            
			params {

				column {
					name "monUuid"
					enclosedIn "updateCephPrimaryStorageMon"
					desc ""
					inUrl true
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "hostname"
					enclosedIn "updateCephPrimaryStorageMon"
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "sshUsername"
					enclosedIn "updateCephPrimaryStorageMon"
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "sshPassword"
					enclosedIn "updateCephPrimaryStorageMon"
					desc ""
					inUrl false
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "sshPort"
					enclosedIn "updateCephPrimaryStorageMon"
					desc ""
					inUrl false
					type "Integer"
					optional true
					since "0.6"
					
				}
				column {
					name "monPort"
					enclosedIn "updateCephPrimaryStorageMon"
					desc ""
					inUrl false
					type "Integer"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc ""
					inUrl false
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIUpdateCephPrimaryStorageMonEvent.class
        }
    }
}