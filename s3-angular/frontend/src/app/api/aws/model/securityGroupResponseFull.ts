/**
 * Swagger REST Article
 * This is the swagger file that goes with our server code
 *
 * The version of the OpenAPI document: 1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { SecurityGroupResponseFullIpPermissions } from './securityGroupResponseFullIpPermissions';
import { KeyPairResponseFullTags } from './keyPairResponseFullTags';


export interface SecurityGroupResponseFull { 
    description?: string;
    groupId?: string;
    groupName?: string;
    ipPermissions?: Array<SecurityGroupResponseFullIpPermissions>;
    ipPermissionsEgress?: Array<SecurityGroupResponseFullIpPermissions>;
    ownerId?: string;
    tags?: Array<KeyPairResponseFullTags>;
    vpcId?: string;
}

